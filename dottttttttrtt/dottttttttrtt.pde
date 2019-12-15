int x1=400;
int x2=200;
int speed=9;
  void setup(){
        size(600,600);
   
 
  }
    void draw(){
         background(0,255,0);
      int size = 300;
      for (int i = 0; i < 8; i++){
   noFill();
 
   ellipse(x1,300,size,size);
    size=size-40;
 }
  

      
  for (int i = 0; i < 8; i++){
   noFill();
 
   ellipse(x2,300,size,size);
    size=size-40;
 
 }
 x1=x1-speed;
   
    x2=x2+speed;
    if(x2>600){
      speed=-speed;
 }
   if(x2<0){
      speed=-speed;
  
 }
  }
    
