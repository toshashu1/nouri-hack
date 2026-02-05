package com.syfe.nouri

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {

    @GetMapping("/")
    @ResponseBody
    fun home(): String {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Nouri Application</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        max-width: 800px;
                        margin: 50px auto;
                        padding: 20px;
                        background-color: #f5f5f5;
                    }
                    .container {
                        background-color: white;
                        padding: 30px;
                        border-radius: 8px;
                        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
                    }
                    h1 {
                        color: #333;
                    }
                    .links {
                        margin-top: 20px;
                    }
                    .links a {
                        display: inline-block;
                        margin-right: 15px;
                        padding: 10px 20px;
                        background-color: #007bff;
                        color: white;
                        text-decoration: none;
                        border-radius: 4px;
                    }
                    .links a:hover {
                        background-color: #0056b3;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Welcome to Nouri Application</h1>
                    <p>Your Spring Boot application is running successfully!</p>
                    <div class="links">
                        <a href="/h2-console">H2 Database Console</a>
                    </div>
                </div>
            </body>
            </html>
        """.trimIndent()
    }
}

