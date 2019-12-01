  int size = 300;
  void setup(){
        size(600,600);
        background(0,255,0);
  for (int i = 0; i < 8; i++){
   if(i%2==1){
     fill(0,0,0);
   }
 else{
   fill(255,0,0);
 }
   ellipse(300,300,size,size);
    size=size-40;
 }
  }

    void draw(){
       /* if(mousePressed){              
            fill(255,0,0);                 
        }
        else{                          
            fill(0,0,0);                 
        }
        ellipse(mouseX, mouseY, 100, 100);
        */
    }
                           
