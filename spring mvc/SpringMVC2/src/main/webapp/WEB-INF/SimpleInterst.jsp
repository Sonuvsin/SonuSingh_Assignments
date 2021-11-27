<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Provide Value</title>
<script>
        function validateForm(){
           var p = document.myForm.principle.value;
          var t = document.myForm.time.value;
              var r = document.myForm.rate.value;
          if(p!="" && t!="" && r!="") {
                        var numbers = /^[0-9]+$/;
                  if(!(p.match(numbers) && t.match(numbers) && r.match(numbers))){
                      alert("Please provide only integer values");
                    return false;
                   }
                }
                else{
                    alert("Textfield can't be empty");
                 return false;
               }       
        }
</script>
</head>
<body>
  <form name="myForm" action="Servletpage" 
        onsubmit="return validateForm()" method="get">
               <h1>Principle: <input type="text" name="principle"><br>
               Rate: <input type="text" name="rate" ><br>
              Time in year: <input type="text" name="time" ><br><br>
             <input type="submit" value="Submit">
              </h1>
  </form>
</body>
</html>