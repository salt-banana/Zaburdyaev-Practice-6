package com.MovingRect;

public class Main {

    public static void main(String[] args) {

        Point vecOrigin = new Point(0,0);
        Point vecTip = new Point(4,4);

        Vector2d velocity = new Vector2d(vecOrigin, vecTip);



        MovablePoint a = new MovablePoint(1,5);
        MovablePoint b = new MovablePoint(5,1);

        MovableRectangle movRect = new MovableRectangle(a,b);



        System.out.println("LEFT TOP POINT: (" + movRect.getLeftTopPoint().getX() + ", " + movRect.getLeftTopPoint().getY() + ")");
        System.out.println("RIGHT BOT POINT: (" + movRect.getRightBotPoint().getX() + ", " + movRect.getRightBotPoint().getY() + ")");



        movRect.move(velocity);

        System.out.println("\nRECTANGLE MOVED BY X = " + (velocity.getTip().x - velocity.getOrigin().x)
        + " AND Y = " + (velocity.getTip().y - velocity.getTip().x));

        System.out.println("LEFT TOP POINT AFTER MOVING: (" + movRect.getLeftTopPoint().getX() + ", " + movRect.getLeftTopPoint().getY() + ")");
        System.out.println("RIGHT BOT POINT AFTER MOVING: (" + movRect.getRightBotPoint().getX() + ", " + movRect.getRightBotPoint().getY() + ")");

    }

}
