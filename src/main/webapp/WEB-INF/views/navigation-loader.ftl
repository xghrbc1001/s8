<img href="#" src="${rc.getContextPath()}/resources/img/logo2.png" style="left: 90px; position: absolute; top: -6px;">
<div class="navbar navbar navbar-static-top">
            <div class="navbar-inner">
                <div class="container"><a href="#" class="brand" style="">Cloud Bookmark</a>
					<button data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar" type="button">
			            <span class="icon-bar"></span>
			            <span class="icon-bar"></span>
			            <span class="icon-bar"></span>
			          </button>
			         <div class="nav-collapse collapse">
			           <ul class="nav" style="padding-left:150px;">
			              <li>
			                <a href="${rc.getContextPath()}/">Home</a>
			              </li>
			              <li class="">
			                <a href="${rc.getContextPath()}/addPost">About Us</a>
			              </li>
			              <li class="">
			                <a href="${rc.getContextPath()}/addPost">Contact Us</a>
			              </li>
			              <li class="">
			                <a href="${rc.getContextPath()}/addPost">Help ?</a>
			              </li>
			            </ul>
			            
			            <#if !loggedInUser?exists>
			            <ul class="nav pull-right">
			            	<li>
			            		<a href="${rc.getContextPath()}/signUp">Sign Up</a>
			            	</li>
			            	<li>
			            		<a href="${rc.getContextPath()}/signIn">Sign In</a>
			            	</li>
			            </ul>
			            <#else>
			            <ul class="nav pull-right">
							<li class="dropdown ds-initial-notification" id="ds-initial-notification">
								<a data-toggle="dropdown" href="#" class="dropdown-toggle">10</a>
								<div data-count="0" class="dropdown-menu gts-flat-dropdown-menu gts-nav-dropdown-ntfn" id="gts-nav-dropdown-ntfn">
								<div class="row"><div class="span4"><header><h4>Notifications</h4></header><div class="gts-ntfn-content"><div class="ntfn-body"></div></div></div></div></div>
							</li>
							<li class="dropdown">
								<a data-toggle="dropdown" href="#" class="dropdown-toggle">${loggedInUser.fullName}</a>
								<div class="dropdown-menu gts-flat-dropdown-menu gts-user-dropdown-menu">
									<img src="${rc.getContextPath()}/resources/img/user-64-64.png" class="user-photo">
									<div class="user-details">
										<ul class="unstyled">
											<li class="user-name">${loggedInUser.fullName}</li>
											<li class="user-email">${loggedInUser.email}</li>
											<li class="divider"></li>
											<li><a href="#">Update Profile</a></li>
											<li><a href="#">App Settings</a></li>
											<li class="divider"></li>
											<li><a href="#">Sign Out</a></li>	
										</ul>
									</div><!-- gts-user-dropdown-details -->
								</div>
							</li>
						</ul>
			            
			        		
			            </#if>
			         </div> 
                </div>
            </div>
        </div>