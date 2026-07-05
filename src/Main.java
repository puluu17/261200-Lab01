public class Main {
    public static void main(String[] args) {
        // Initialize the turtle
        Turtle bob = new Turtle();

        // 1. Set a dark midnight sky background
        Turtle.bgcolor("gray");
        bob.speed(0); // Set to instant drawing speed

        // 2. Draw the main glowing moon base (a large yellow circle)
        bob.up();
        bob.setPosition(60, 60); // Position it in the upper right sky
        bob.shape("circle");
        bob.shapeSize(150, 150); // Make it a large full moon shape
        bob.fillColor("gold");
        bob.outlineColor("lightyellow");
        bob.outlineWidth(2);
        bob.stamp();

        // 3. Create a "Crescent" effect by layering a navy circle slightly offset
        // This acts like a shadow covering part of the moon
        bob.setPosition(95, 60); // Shift slightly to the right
        bob.fillColor("gray");    // Match the background color exactly
        bob.outlineColor("gray");
        bob.stamp();

        // 4. Add a tiny twinkling star in the sky using built-in shapes
        bob.setPosition(-100, 120);
        bob.shape("triangle"); // Use a small triangle as a star point
        bob.shapeSize(15, 15);
        bob.fillColor("white");
        bob.outlineColor("white");
        bob.stamp();

        // Flip the triangle to make it a 4-pointed star
        bob.setDirection(270);
        bob.stamp();


        // Hide the turtle cursor when finished
        bob.hide();
    }
}