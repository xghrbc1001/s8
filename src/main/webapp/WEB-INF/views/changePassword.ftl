<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>
<@macro.showHeader />
<div class="row-fluid inner-col" ng-controller="ChangePassword">
	<fieldset>
	<legend>Change Password</legend>
	<div class="span3"></div>
	<div class="span6">
	
		  <div class="alerts">
            <div bs-alert="alert" ng-repeat="alert in alerts" class="alert fade ng-scope in alert-{{alert.type}}"><button data-dismiss="alert" class="close" type="button">x</button><strong class="ng-scope">{{alert.title}}</strong><span class="ng-scope">{{alert.content}}</div>
          </div>
        
        
		<form class="form-horizontal" name="form">
			   <div class="control-group">
			      <label class="control-label" for="inputEmail">Old Password</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-key"></i></span> <input type="password" placeholder="Old Password" name="oldPassword" class="input-large" ng-model="user.oldPassword" required/> </div>
			      </div>
			   </div>
			   
			   <div class="control-group">
			      <label class="control-label" for="inputEmail">New Password</label>
			      <div class="controls">
			         <div class="input-prepend"> <span class="add-on"><i class="icon-key"></i></span> <input type="password" placeholder="New Password" name="newPassword" class="input-large" ng-model="user.newPassword" required/> </div>
			      </div>
			   </div>
			   <div class="form-actions">
				<input type="button" id="submit" value="Change Password" class="btn btn-success" ng-click="submit()"/>
				<button type="button" class="btn">Cancel</button>
    		   </div>
		</form>
	</div>
	<div class="span3"></div>
	</fieldset>	
</div>
<@macro.showFooter>
	<script type="text/javascript" src="${rc.getContextPath()}/resources/js/pages/changePassword.js"></script>
</@macro.showFooter>