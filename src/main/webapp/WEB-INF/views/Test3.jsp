
<%--
  Created by IntelliJ IDEA.
  User: 14216
  Date: 2020/2/2
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test3</title>
    <script type="text/javascript" src="${ctx}/webjars/jquery/3.3.1-2/jquery.min.js"></script>
</head>
<body>

    Test 6-3 !
    <button onclick="test1();">Test</button>
    <br>
    <table border="1" id="testTable" style="text-align: center;">
        <tr id="headtable">
            <th>name</th>
            <th>id</th>
            <th>address</th>
        </tr>
    </table>
    <script type="text/javascript">
        function test1(){
            //alert("Test_1");
            $.ajax({
                type:"POST",
                url:"${pageContext.request.contextPath }/rd",
                dataType : "json",
                contentType:"application/json;charset=utf-8",
                data:{},
                success:function(result){
                    //alert("Test_2");
                    //alert(result[1]["name"]);
                    var tempHtml ="";
                    for(var i = 0; i< result.length; i++)
                    {
                        tempHtml += "<tr>";
                        tempHtml += "<td>"+result[i]["name"] +"</td>";
                        tempHtml += "<td>"+result[i]["id"] +"</td>";
                        tempHtml += "<td>"+result[i]["address"] +"</td>";
                        tempHtml += "</tr>";
                    }
                    $("#testTable").append(tempHtml);

                },
                //<a href='javascript:BackCurPageNumIndex()'>Index</a>
                error : function(XMLHttpRequest, textStatus, errorThrown) {
                    alert("Error,Exceptions:"+textStatus,"error");
                }
            });
        }
    </script>
</body>


</html>
