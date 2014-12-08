<div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar" type="button">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="#" class="brand"><img src="${rc.getContextPath()}/resources/img/logo.png" style="height:50px;"/> Online Bookmark</a>
          <div class="nav-collapse collapse">
            <ul class="nav" style="top:13px;padding-left:110px;">
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
            <ul class="nav pull-right"  style="top:13px;padding-left:110px;">
            	<li>
            		<a href="${rc.getContextPath()}/signUp">Sign Up</a>
            	</li>
            	<li>
            		<a href="${rc.getContextPath()}/signIn">Sign In</a>
            	</li>
            </ul>
            <#else>
        		<ul class="nav pull-right" style="top:13px;padding-left:110px;">
                  <li><a href="#">Welcome <#if loggedInUser?exists>${loggedInUser.userName}</#if></a></li>
                  <li></li>
                  <li><a href="#">Log Out</a></li>
                </ul>
            </#if>
          </div>
        </div>
      </div>
    </div>