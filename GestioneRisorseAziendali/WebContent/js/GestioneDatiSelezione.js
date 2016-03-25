$('.ricercaToggle').click(function(){
    $('.main').toggle();
    $('.main2').css("display","none");
})

$('input:radio').change(function(){
    if (document.getElementById('modulo').checked) {
         document.getElementById('moduloText').disabled = false;
    }
    else if (document.getElementById('intervalloPunteggio').checked) {
        document.getElementById('max').disabled = false;
        document.getElementById('min').disabled = false;
        document.getElementById('punteggio').disabled = true;
        document.getElementById('punteggio').value="";
        
    }
    else if (document.getElementById('moduloPunteggio').checked){
        document.getElementById('punteggio').disabled= false;
        document.getElementById('max').disabled = true;
        document.getElementById('min').disabled = true;
        document.getElementById('max').value="";
        document.getElementById('min').value="";
    }
    else 
    {
        document.getElementById('punteggio').disabled = true;
        document.getElementById('punteggio').value="";
        document.getElementById('max').value="";
        document.getElementById('min').value="";
        document.getElementById('punteggio').value="";
        document.getElementById('max').disabled= true;
        document.getElementById('min').disabled= true;
        document.getElementById('punteggio').disabled= true;
        document.getElementById('moduloText').value="";
        document.getElementById('moduloText').disabled = true;
    }
})

$('.ricercaToggle2').click(function(){
    $('.main').css("display","none");
    $('.main2').toggle();
})