// int numFrames = 490;  // The number of animation frames;
// int numFrames = 258;  // The number of animation frames that would load with large png
int numFrames = 590;  // The number of animation frameset-to-register
PImage[] images = new PImage[numFrames];  // Image array

void setup() {
  size(620, 480);
  frameRate(25);

  for (int i = 1; i < images.length; i++) {
    // String imageName =  nf(i, 4) + ".gif";
        String imageName =  nf(i, 5) + ".jpg";
    images[i] = loadImage(imageName);
  }
} 

void draw() { 
  // Calculate the frame to display, use % to cycle through frames
  int frame = frameCount % numFrames;  
  image(images[frame], 10, 10);
}
