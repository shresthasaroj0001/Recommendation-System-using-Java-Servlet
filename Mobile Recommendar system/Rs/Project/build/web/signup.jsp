<%@page import="com.controller.userLogin.User_Model"%>
<html>
    <head>
        <style>
            *{
                box-sizing: border-box;
            }
            html{
                height: 100%;
            }
            body{
                padding: 60px 15px;
                min-height: 100%;
                background-image: linear-gradient(61deg, #ff512f 0%, #dd2476 100%);
                background-size: cover;
            }

            /* Form */
            .form{
                max-width: 460px;
                padding: 30px;
                margin: 0 auto;
                border-radius: 4px;
                box-shadow: 0 0 10px rgba(0,0,0,.2);
                background: #ffffff;
            }
            /* Row */
            .form__row{
                display: flex;
                width: 100%;
                justify-content: center;
            }
            .form__row:not(:first-child){
                margin-top: 15px;
            }
            /* Field */
            .form__input{
                width: 100%;
                padding: 10px 15px;
                border: 0;
                border-radius: 4px;
                background-color: #eee;
                font-size: 14px;
                line-height: 20px;
                color: #7a7b7f;
                transition: box-shadow 0.2s ease;
            }
            .form__input:focus{
                outline: none;
                box-shadow: 0 0 3px rgba(0,0,0,0.3);  
            }
            .form__input ~ .form__input{
                margin-left: 15px;
            }
            /* Submit */
            .form__submit{
                position: relative;
                width: 100%;
                height: 50px;
                border: 0;
                border-radius: 4px;
                background-color: #ea355a;
                box-shadow: 0 3px #bd1962;
                font-size: 18px;
                font-weight: bold;
                color: #fff;
                cursor: pointer;
                outline: none;
                transition: background 0.5s ease;
            }
            .form__submit:hover{
                background: #ff512f;
            }
            .form__submit:active{
                box-shadow: none;
                top: 2px;
                box-shadow: 0 1px #bd1962;
            }
            /* Reset */
            .form__reset{
                border: 1px solid #eee;
                border-radius: 4px;
                background-color: transparent;
                font-size: 12px;
                line-height: 20px;
                color: #7a7b7f;
                outline: none;
                cursor: pointer;
                transition: border-color 0.5s ease;
            }
            .form__reset:hover{
                border-color: #7a7b7f;
            }

        </style>
    </head>
    <body>
        <%
            Boolean isSuccess = (Boolean) request.getAttribute("isSuccess");
            User_Model u = (User_Model) request.getAttribute("enteredData");
            Boolean ReturnData = false;
        %>

        <%
            if (isSuccess != null) {
                if (isSuccess) {
                    ReturnData = !ReturnData;
        %>
        <% response.sendRedirect("index.jsp");
                }
            }%>
        <form action="SignUpController" method="post" class="form">
            <div class="form__row">
                <input class="form__input" value="<%if(ReturnData) out.println(u.getStaff_first_name());%>" required="" type="text" name="first-name" placeholder="First name">
                <input class="form__input" value="<%if(ReturnData) out.println(u.getStaff_middle_name());%>"  type="text" name="middle-name" placeholder="Middle name">
            </div>
            <div class="form__row">
                <input class="form__input" type="text" name="last-name" placeholder="Last Name" required="" value="<%if(ReturnData) out.println(u.getStaff_last_name());%>">
            </div>
            <div class="form__row">
                <input class="form__input" type="password" name="password" placeholder="password" required="">
            </div>
            <div class="form__row">
                <button class="form__submit" type="submit">Sign up for free</button>
            </div>
            <div class="form__row">
                <button class="form__reset" type="reset">Reset form</button>
            </div>
        </form>
    </body>

</html>