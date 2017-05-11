<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Donor</title>
<!-- bootstrap css files -->
<link rel="stylesheet" href="css/bootstrap-theme.css">
<link rel="stylesheet" href="css/bootstrap-theme.css.map">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css.map">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.css.map">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css.map">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker.css.map">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker.min.css.map">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Bootstrap js files -->
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/npm.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/js/bootstrap-datepicker.min.js"></script>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- bootstrap fonts -->

<!-- angularjs js file -->
<script type="text/javascript" src="js/angular.js"></script>

</head>
<body>

	<div class="container">
	<div class="row">
	
  			 <div class="col-xs-8 col-md-8">
  			   
  			  <h2>Create Donor</h2>
  			  
			 <ul class="nav nav-tabs">
			    <li class="active"><a data-toggle="tab" href="#personal">Personal Information</a></li>
			    <li><a data-toggle="tab" href="#bank">Bank Details</a></li>
			    <li><a data-toggle="tab" href="#payment">Payment Details</a></li>
  			</ul><br>
     <div class="tab-content">
  	   <div id="personal" class="tab-pane fade in active">
  			 <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-user"></span></span>
                     <input type="text" class="form-control" placeholder="First Name" aria-describedby="sizing-addon1">
              </div> <br>
               <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-user"></span></span>
                     <input type="text" class="form-control" placeholder="Last Name" aria-describedby="sizing-addon1">
               </div><br>
  			   <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-envelope"></span></span>
                     <input type="text" class="form-control" placeholder="Email" aria-describedby="sizing-addon1">
               </div><br>
               <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-phone"></span></span>
                     <input type="text" class="form-control" placeholder="Mobile" aria-describedby="sizing-addon1">
               </div> 
               <nav aria-label="...">
  <ul class="pager">
   <!--  <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span> Older</a></li> -->
    <li class="next"><a data-toggle="tab" href="#bank"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
  </ul>
</nav>
               
               
          </div>
                              
          <div id="bank" class="tab-pane fade">
                <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-user"></span></span>
                     <input type="text" class="form-control" placeholder="Account Holder Name" aria-describedby="sizing-addon1">
                </div> <br>
                         
                <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-home"></span></span>
                     <input type="text" class="form-control" placeholder="Bank Name" aria-describedby="sizing-addon1">
                </div> <br>
                         
                <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-th-list"></span></span>
                     <input type="text" class="form-control" placeholder="Account No." aria-describedby="sizing-addon1">
                </div> <br>
                         
               	<div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-flag"></span></span>
                     <input type="text" class="form-control" placeholder="Branch" aria-describedby="sizing-addon1">
                </div> <br>
                         
                <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-record"></span></span>
                     <input type="text" class="form-control" placeholder="IFSC Code" aria-describedby="sizing-addon1">
                 </div> <br>
                         
                 <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-check"></span></span>
                      <!-- <input type="text" class="form-control" placeholder="First Name" aria-describedby="sizing-addon1"> -->
                      <select class="form-control">
                          <option>SB</option>
                          <option>CA</option>
                          <option>SB-NRE</option>
                           <option>SB-NRO</option>
                            <option>Other</option>
                          
                      </select>
                   </div> 
                   <ul class="pager">
                   <li class="previous"><a data-toggle="tab" href="#personal"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
                   <li class="next"><a data-toggle="tab" href="#payment"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
                   </ul>
           </div> 
           <div id="payment"  class="tab-pane fade">
        <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" placeholder="Start Date"/>
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
                   <script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
        </script>
        
         <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" placeholder="End Date Date"/>
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
                   <script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
        </script>
         <div class="input-group input-group-lg">
                  <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-usd"></span></span>
                     <input type="text" class="form-control" placeholder="Amount in Rupees" aria-describedby="sizing-addon1">
               </div> <br>
        <p>Frequency</p>
       <form>
      <input type="radio" name="frequency" value="Daily" checked>Daily&nbsp;
      <input type="radio" name="frequency" value="Weekly">Weekly&nbsp;
      <input type="radio" name="frequency" value="Quarterly">Quarterly&nbsp;
      <input type="radio" name="frequency" value="Semi Annualy">Semi Annualy&nbsp;
      <input type="radio" name="frequency" value="Yearly">Yearly&nbsp;
      <input type="radio"  name="frequency" value="Bi-Monthly	">Bi-Monthly	&nbsp;
      <input type="radio"  name="frequency" value="As and When Presented">As and When Presented&nbsp;
</form>
         <input type="button" class="btn btn-default" value=Submit>
         
         <ul class="pager">
         <li class="previous"><a data-toggle="tab" href="#bank"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
         </ul>
        </div>
    </div>
</div>

  			 <div class="col-xs-6 col-md-4"></div>

		
	</div>
	</div> 
</body>
</html>