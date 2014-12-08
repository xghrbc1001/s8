<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>
<@macro.showHeader />
<div class="row-fluid inner-col" ng-controller="SignInCtrl">
	<fieldset>
	<legend>Sign In to Online Bookmark</legend>
	<div class="span3"></div>
	<div class="span6">
	
		  <div class="alerts">
            <div bs-alert="alert" ng-repeat="alert in alerts" class="alert fade ng-scope in alert-{{alert.type}}"><button data-dismiss="alert" class="close" type="button">x</button><strong class="ng-scope">{{alert.title}}</strong><span class="ng-scope">{{alert.content}}</div>
          </div>
        
        
		<form class="form-horizontal" name="form">
			   <div class="control-group">
			   	  <label class="control-label" for="inputEmail">User Name</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-user"></i></span> <input type="text" placeholder="User Name" name="userName" class="input-large" autofocus="" ng-model="user.userName" required/> </div>
			      </div>
			   </div>
			   
			   <div class="control-group">
			      <label class="control-label" for="inputEmail">Password</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-key"></i></span> <input type="password" placeholder="Password" name="password" class="input-large" ng-model="user.password" required/> </div>
			      </div>
			   </div>
			   <div class="form-actions">
				<input type="button" id="submit" value="Login" class="btn btn-success" ng-click="submit()"/>
				<button type="button" class="btn">Cancel</button>
    		   </div>
		</form>
	</div>
	<div class="span3"></div>
	</fieldset>	
</div>
<@macro.showFooter>
	<script type="text/javascript" src="${rc.getContextPath()}/resources/js/pages/signIn.js"></script>
</@macro.showFooter>