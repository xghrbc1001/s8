<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>
<@macro.showHeader />
<div class="row-fluid inner-col" ng-controller="SignUpCtrl">
	<fieldset>
	<legend>Sign Up to Online Bookmark</legend>
	<div class="span3"></div>
	<div class="span6">
	
		  <div class="alerts">
            <div bs-alert="alert" ng-repeat="alert in alerts" class="alert fade ng-scope in alert-{{alert.type}}"><button data-dismiss="alert" class="close" type="button">x</button><strong class="ng-scope">{{alert.title}}</strong><span class="ng-scope">{{alert.content}}</div>
          </div>
        
        
		<form class="form-horizontal" name="form" novalidate>
			<div class="control-group">
			   	  <label class="control-label" for="inputEmail">Full Name</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-user"></i></span> <input type="text"  placeholder="Full Name" class="input-large" autofocus="" ng-model="user.fullName" required/> </div>
			      </div>
			   </div>
			   
			   <div class="control-group">
			   	  <label class="control-label" for="inputEmail">User Name</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-user"></i></span> <input type="text" placeholder="User Name" class="input-large" autofocus="" ng-model="user.userName" required/> </div>
			      </div>
			   </div>
			   
			   <div class="control-group">
			   	  <label class="control-label" for="inputEmail">Email</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-envelope"></i></span> <input type="email" placeholder="Email address" class="input-large" ng-model="user.email" required/> </div>
			      </div>
			   </div>
			   <div class="form-actions">
				<button type="button" ng-disabled="form.$invalid" class="btn btn-info offset1" ng-click="doSignUp()">Register</button>
				<button type="button" class="btn">Cancel</button>
    		   </div>
		</form>
	</div>
	<div class="span3"></div>
	</fieldset>	
</div>
<@macro.showFooter>
	<script type="text/javascript" src="${rc.getContextPath()}/resources/js/pages/signUp.js"></script>
</@macro.showFooter>