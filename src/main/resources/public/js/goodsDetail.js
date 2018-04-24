
    var sw = document.getElementsByClassName("tab-nav")[0].getElementsByTagName("li");
    var divList = document.getElementsByClassName("tab-content")[0].getElementsByTagName("div");
    console.log(divList)
    for (var i = 0; i < sw.length ; i++) {
      
      sw[i].onclick = function(){
        for(var j = 0;j < sw.length; j++){
          sw[j].className = "";
        }
          this.className = "active";
        for (var n = 0; n<divList.length; n++) {
          divList[n].className="";
        }
        if (this.innerHTML == "商品详情") {
          divList[0].className="show";
          
        }
        if (this.innerHTML == "评价") {
          divList[1].className="show";
          
        }
      }
    }
  