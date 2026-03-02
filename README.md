# User API Specification

## Create User
Endpoint : POST /api/users

Request Body :

```json
{
  "name" : "Chesta Yurcel Zebada",
  "age" : 20
}
```

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "name": "Chesta Yurcel Zebada",
    "age": 20
  }
}
```

Response Body (failed) :

```json
{
  "error": "Invalid input data"
}
```

## Update User
Endpoint : PUT /api/users/{id}

Request Body :

```json
{
  "nama" : "Chesta Yurcel Zebadaaaa",
  "usia" : 25
}
```

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "Chesta Yurcel Zebadaaaa",
    "usia": 25
  }
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

## Get User
Endpoint : GET /api/users

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "Chesta Yurcel Zebadaaaa",
    "usia": 25
  }
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

## Delete User
Endpoint : DELETE /api/users/{id}

Response Body (success) :

```json
{
  "message": "User deleted successfully"
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

# Screenshots

<img width="1920" height="1080" alt="Screenshot (296)" src="https://github.com/user-attachments/assets/8bc7b8eb-1ece-472c-ab33-0bce0ae1c917" />
<img width="1920" height="1080" alt="Screenshot (297)" src="https://github.com/user-attachments/assets/cdb6b4df-2694-4df4-85fa-05998e837606" />
<img width="1920" height="1080" alt="Screenshot (298)" src="https://github.com/user-attachments/assets/b519dbfc-0905-44c5-8e0b-667f0a875cb7" />
<img width="1920" height="1080" alt="Screenshot (299)" src="https://github.com/user-attachments/assets/e9a1bf09-e4af-4baf-92c6-f890fe1f3fba" />
<img width="1920" height="1080" alt="Screenshot (300)" src="https://github.com/user-attachments/assets/7b9786b7-450b-4464-bcfc-97fba40b4969" />
