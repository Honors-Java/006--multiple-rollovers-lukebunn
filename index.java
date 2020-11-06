void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
  line(width/2,0,width/2,height);
  line(0,height/2,500,height/2);
  line(0,0,width,0);
  line(0,0,0,height);
  line(height - 1,0,height - 1,width - 1);
  line(0, height - 1,height - 1,width - 1);
  //Fill a black color
  if(mouseX < width/2 && mouseY < height/2){
    fill(40,70,30);
    rect(0,0,width/2,height/2);
  }
  if(mouseX > width/2 && mouseY < height/2){
    fill(40,70,30);
    rect(width/2,0,width,height/2);
  }
 if(mouseX < width/2 && mouseY > height/2){
  fill(40,70,30);
  rect(0,height/2,width/2,height);
 }
 if(mouseX > width/2 && mouseY > height/2){
   fill(40,70,30);
   rect(width/2,height/2,width,height);
 }
  
  //Build your conditional statement 
	

}