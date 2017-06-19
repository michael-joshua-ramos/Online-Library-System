<%-- 
    Document   : LogIn
    Created on : Jun 15, 2017, 10:42:30 PM
    Author     : Michael Joshua Ramos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Online Library System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
                background-color: #fafafa;
            }
            
            #pswd_info {
                position:absolute;
                bottom:-75px;
                bottom: -115px\9; /* IE Specific */
                right:510px;
                width:250px;
                padding:15px;
                background:#fefefe;
                font-size:.875em;
                border-radius:5px;
                box-shadow:0 1px 3px #ccc;
                border:1px solid #ddd;
            }
            
            #pswd_info h5 {
                margin:0 0 10px 0;
                padding:0;
                font-weight:normal;
            }
            
            #pswd_info::before {
                content: "\25B2";
                position:absolute;
                top:-12px;
                left:45%;
                font-size:14px;
                line-height:14px;
                color:#ddd;
                text-shadow:none;
                display:block;
            }
        </style>
    </head>
    <body> 
        <br/>
        
        <h3 align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;REGISTER ACCOUNT</h3>
        
        <br/><br/>
        
        <form class="col-sm-offset-3 form-horizontal">
            <div class="form-group">
                <label class="col-sm-2 control-label">First Name</label>
                <div class="col-sm-6">
                    <input class="form-control input-sm" id="inputEmail3">
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label">Middle Initial</label>
                <div class="col-sm-2">
                    <input class="form-control input-sm" id="inputEmail3">
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label">Last Name</label>
                <div class="col-sm-6">
                    <input class="form-control input-sm" id="inputEmail3">
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label">Date of Birth</label>
                <div class="col-sm-2">
                    <input class="form-control input-sm" id="inputEmail3" placeholder="MM">
                </div>
                <div class="col-sm-2">
                    <input class="form-control input-sm" id="inputEmail3" placeholder="DD">
                </div>
                <div class="col-sm-2">
                    <input class="form-control input-sm" id="inputEmail3" placeholder="YYYY">
                </div>
            </div> 
            <div class="form-group">
                <label class="col-sm-2 control-label">Job Title</label>
                <div class="col-sm-6 btn-group" role="group">
                    <button type="button" class="btn btn-default">Student</button>
                    <button type="button" class="btn btn-default">Employee</button>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">ID Number</label>
                <div class="col-sm-2">
                    <input class="form-control input-sm" id="inputEmail3">
                </div>
            </div> 
            <br/><br/>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
                <div class="col-sm-6">
                    <input type="email" class="form-control" id="inputEmail3">
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">Username</label>
                <div class="col-sm-6">
                    <input type="email" class="form-control" id="inputEmail3">
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-6">
                    <input type="password" class="form-control" id="inputEmail3">
                </div>
            </div><br/>
            <div id="pswd_info">
                <h5>Password must meet the following requirements:</h5>
                <ul>
                    <li id="letter" class="invalid">At least <strong>one letter</strong></li>
                    <li id="capital" class="invalid">At least <strong>one capital letter</strong></li>
                    <li id="number" class="invalid">At least <strong>one number</strong></li>
                    <li id="length" class="invalid">Be at least <strong>8 characters</strong></li>
                </ul>
            </div>
        </form><br/><br/>
    </body>
</html>
