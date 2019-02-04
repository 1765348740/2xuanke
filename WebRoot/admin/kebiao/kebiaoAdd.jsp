<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
        
        <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />

		<%--使window.showModalDialog可以在谷歌使用--%>
		<script type="text/javascript">
            // fix for deprecated method in Chrome 37
            if (!window.showModalDialog) {
                window.showModalDialog = function (arg1, arg2, arg3) {

                    var w;
                    var h;
                    var resizable = "no";
                    var scroll = "no";
                    var status = "no";

                    // get the modal specs
                    var mdattrs = arg3.split(";");
                    for (i = 0; i < mdattrs.length; i++) {
                        var mdattr = mdattrs[i].split(":");

                        var n = mdattr[0];
                        var v = mdattr[1];
                        if (n) { n = n.trim().toLowerCase(); }
                        if (v) { v = v.trim().toLowerCase(); }

                        if (n == "dialogheight") {
                            h = v.replace("px", "");
                        } else if (n == "dialogwidth") {
                            w = v.replace("px", "");
                        } else if (n == "resizable") {
                            resizable = v;
                        } else if (n == "scroll") {
                            scroll = v;
                        } else if (n == "status") {
                            status = v;
                        }
                    }

                    var left = window.screenX + (window.outerWidth / 2) - (w / 2);
                    var top = window.screenY + (window.outerHeight / 2) - (h / 2);
                    var targetWin = window.open(arg1, arg1, 'toolbar=no, location=no, directories=no, status=' + status + ', menubar=no, scrollbars=' + scroll + ', resizable=' + resizable + ', copyhistory=no, width=' + w + ', height=' + h + ', top=' + top + ', left=' + left);
                    targetWin.focus();
                };
            }
		</script>
        
        <script language="javascript">
          function kechengAll()
		    {
		       	var strUrl ="<%=path %>/kebiao?type=kechengMana";
				var ret = window.showModalDialog(strUrl,"","dialogWidth:700px; dialogHeight:500px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
				if(ret==undefined)
			    {
			        ret="";
			    }

			    document.getElementById("kecheng_id").value=ret;
		    }


		    function laoshiAll()
		    {
		       	var strUrl = "<%=path %>/laoshi";
				var ret = window.showModalDialog(strUrl,"","dialogWidth:700px; dialogHeight:500px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
			    if(ret==undefined)
			    {
			        ret="";
			    }

			    document.getElementById("laoshi_id").value=ret;
		    }
		    
		    
		    
		    function check()
		    {
		        if(document.getElementById("kecheng_id").value=="")
		        {
		            alert("请选择课程");
		            return false;
		        }
		        if(document.getElementById("laoshi_id").value=="")
		        {
		            alert("请选择授课老师");
		            return false;
		        }
		        
		        document.formAdd.submit();
		    } 
        </script>
	</head>

	<body leftmargin="2" topmargin="9" background='<%=path %>/img/allbg.gif'>
			<form action="<%=path %>/kebiaoAdd" name="formAdd" method="post">
				     <table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
						<tr bgcolor="#E7E7E7">
							<td height="14" colspan="3" background="<%=path %>/img/tbg.gif">&nbsp;课表管理&nbsp;</td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         课程编号：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="kecheng_id" id="kecheng_id"  size="50"/>
						        <input type="button" value="选择" onclick="kechengAll()"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         时间：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <select name="shijian">
						            <option value="星期一">星期一</option>
						            <option value="星期二">星期二</option>
						            <option value="星期三">星期三</option>
						            <option value="星期四">星期四</option>
						            <option value="星期五">星期五</option>
						        </select>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         节次：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <select name="jieci">
						            <option value="1-2">1-2</option>
						            <option value="3-4">3-4</option>
						            <option value="5-6">5-6</option>
						            <option value="7-8">7-8</option>
						            <option value="9-10">9-10</option>
						        </select>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        上课教室：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <select name="jiaoshi">
						            <option value="多媒体教室">多媒体教室</option>
						        </select>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         授课老师编号：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="laoshi_id" id="laoshi_id"  size="50"/>
						        <input type="button" value="选择" onclick="laoshiAll()"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						       <input type="button" value="提交" onclick="check()"/>&nbsp; 
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
