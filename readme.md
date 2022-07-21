# Spring Student Rest APIs


It is a simple student REST API.

## Features

- Add Student
- Get All Student Data
- Find Student By ID
- Find Student By Name
- Delete By ID
- Update Student Data


## EndPoints

Add Student Data `[POST]`
```sh
http://localhost:8080/student
```
Object Model
```sh
{
    "studentName": "shiva",
    "studentEmail":"shiva@gmail.com",
    "studentNumber": "38837646"
}
```

Get All Students Data `[GET]`
```sh
http://localhost:8080/student
```

Find Student By ID `[GET]`
```sh
http://localhost:8080/student/id/d958f6c3-90e4-455f-9b62-31451e15e190
```

Find Student By Name `[GET]`
```sh
http://localhost:8080/student/name/shiva
```

Delete By ID `[DELETE]`
```sh
http://localhost:8080/student/id/d958f6c3-90e4-455f-9b62-31451e15e190
```

Update Student Data `[PUT]`
```sh
http://localhost:8080/student/id/d958f6c3-90e4-455f-9b62-31451e15e190
```
Object Model
```sh
{
    "studentName": "shiva",
    "studentEmail":"shiva@gmail.com",
    "studentNumber": "9023236992"
}
```


