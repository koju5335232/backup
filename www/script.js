for(var a=1;a<=25;a++){
    if(a%5==0){
        document.write("★"+"<br>");
    }else{
        document.write("★");
    }
}
document.write("<br>");
var i=0;
while(i<25){
    if(i!=0&&i%5==0){
        document.write("<br>");
    }if(i==0||i%6==0){
        document.write("☆");
    }else{
        document.write("★");
    }
    i=i+1;
}