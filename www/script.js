for(var a=0;a<5;a++){
    document.write("★");
}
document.write("<br>");
for(var b=0;b<2;b++){
    for(var c=0;c<3;c++){
        document.write("★");
    }document.write("<br>");
}
document.write("<br>");
for(var d=0;d<3;d++){
    for(var e=0;e<3;e++){
        if(e%2==0){
            document.write("★");
        }else{
            document.write("☆");
        }
    }document.write("<br>");
}
document.write("<br>");
for(var f=0;f<5;f++){
    for(var g=0;g<=f;g++){
        document.write("★");
    }document.write("<br>");
}
function menseki(hankei){
    return(hankei*hankei*3.14)
}
document.write(menseki(5)+"<br>");

function ryoukin(otona,kodomo){
    return(otona*500+kodomo*200)
}
document.write(ryoukin(2,4)+"<br>");
for(var h=0;h<5;h++){
    for(var i=0;i<5;i++){
        if((h+i)%2==0){
            document.write("★");
        }else{
            document.write("☆");
        }
    }document.write("<br>");
}
document.write("<br>");
for(var j=0;j<5;j++){
    for(var k=0;k<5;k++){
        if(j==k){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}
document.write("<br>");
for(var l=0;l<5;l++){
    for(var m=0;m<=l;m++){
        if(m==l){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}