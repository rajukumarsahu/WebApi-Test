<html>
<body>
<h3>Welcome to Employee Home</h3>
<hr/>
<pre> 
  <form action="create" method="POST">
  ID:<input type="text" name="id"/>
  Name:<input type="text" name="name"/>
  Sal:<input type="text" name="sal"/>
  Password:<input type="Password" name="pass"/>
  Gender:<input type="radio" name="empGen" Value="Male">Male
   <input type="radio" name="empGen" Value="FeMale">Female
   Department:<select name="empDept">
   <option>---Select---</option>
   <option>QA</option>
   <option>QA</option>
   <option>QA</option>
   </select>
   Address:<textarea name="empAddress"></textarea>
   DOJ:-<input type="date" name="empDoj">
   <input type="submit" value="Create"/>
  
  </form>
  </pre>
</body>
</html>