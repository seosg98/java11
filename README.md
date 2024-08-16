ackage APi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@GetMapping
@RestController
@Controller
public class APIProject {

    {
        "username": "user123",
            "password": "pass1234"
    }

    {
        "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
            "expires_in": 3600
    }

    {
        "error": "Invalid credentials"
    }

    {
        "id": 1,
            "username": "user123",
            "email": "user123@example.com",
            "created_at": "2023-08-15T12:00:00Z"
    }

    {
        "error": "Unauthorized"
    }

    {
        "api_overview": {
        "description": "이 프로젝트의 API는 다양한 클라이언트가 서버와 통신할 수 있도록 RESTful 방식으로 설계되었습니다. 모든 API는 'application/json' 형식의 데이터를 사용합니다.",
                "authentication": "이 API는 Bearer Token 인증 방식을 사용합니다. 모든 요청의 헤더에 'Authorization: Bearer <token>' 형식으로 토큰을 포함시켜야 합니다."
    },
        "apis": [
        {
            "name": "사용자 로그인",
                "url": "/api/auth/login",
                "method": "POST",
                "description": "사용자가 로그인하고 인증 토큰을 발급받습니다.",
                "request": {
            "parameters": {
                "username": "user123",
                        "password": "pass1234"
            }
        },
            "response": {
            "success": {
                "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
                        "expires_in": 3600
            },
            "error": {
                "status_code": 401,
                        "message": "Invalid credentials"
            }
        }
        },
        {
            "name": "사용자 정보 조회",
                "url": "/api/user/me",
                "method": "GET",
                "description": "인증된 사용자의 정보를 조회합니다.",
                "request": {
            "headers": {
                "Authorization": "Bearer <token>"
            }
        },
            "response": {
            "success": {
                "id": 1,
                        "username": "user123",
                        "email": "seosg98@gmail.com",
                        "created_at": "2023-08-15T12:00:00Z"
            },
            "error": {
                "status_code": 401,
                        "message": "Unauthorized"
            }
        }
        },
        {
            "name": "사용자 로그아웃",
                "url": "/api/auth/logout",
                "method": "POST",
                "description": "사용자가 로그아웃하고 인증 토큰을 무효화합니다.",
                "request": {
            "headers": {
                "Authorization": "Bearer <token>"
            }
        },
            "response": {
            "success": {
                "message": "Successfully logged out"
            },
            "error": {
                "status_code": 401,
                        "message": "Unauthorized"
            }
        }
        }
  ]
    }

}

