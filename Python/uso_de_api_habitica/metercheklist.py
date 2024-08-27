import requests
from requests.exceptions import RequestException

# Tus credenciales de la API de Habitica
user_id = "censurado"
api_token = "censurado"

# ID de la tarea a la que quieres añadir la checklist
task_id = "censurado"

# URL base de la API de Habitica
base_url = "https://habitica.com/api/v4/tasks"

# Encabezados para la autenticación
headers = {
    "x-api-user": user_id,
    "x-api-key": api_token,
    "Content-Type": "application/json"
}

# Función para añadir un elemento a la checklist
def add_checklist_item(task_id, item_text):
    url = f"{base_url}/{task_id}/checklist"
    data = {"text": item_text}
    try:
        response = requests.post(url, json=data, headers=headers)
        response.raise_for_status()  # Esto verificará si la respuesta es un código de error HTTP
        return response.json()
    except RequestException as e:
        print(f"Error en la solicitud HTTP: {e}")
        print(f"Respuesta HTTP: {response.text}")
        return None

# Añadir elementos a la checklist
for i in range(1, 1001):
    result = add_checklist_item(task_id, str(i))
    if result is not None:
        print(f"Añadido elemento {i}: {result.get('success')}")
    else:
        print(f"No se pudo añadir el elemento {i}")