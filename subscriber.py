import json

import redis
import paho.mqtt.client as mqtt

# Initialize the Redis cache
redis_cache = redis.StrictRedis(host='127.0.0.1', port=6379, db=2)

# MQTT client for subscribing to doctor topics
mqtt_client = mqtt.Client()
mqtt_client.connect("broker.emqx.io", 1883, 60)


def on_message(client, userdata, message):
    patient_details = json.loads(message.payload.decode())
    patient_id = message.topic
    print(f"{patient_id} - {patient_details}")
    # Store the patient information in the Redis cache
    redis_cache.set(patient_id, message.payload.decode())

n = 5

for i in range(n):
    topic = "patient" + str(i+1)
    print("Connected to " + topic)
    mqtt_client.subscribe(topic)
    mqtt_client.on_message = on_message
    mqtt_client.message_callback_add(topic, on_message)

mqtt_client.loop_forever()
