/* This file is given to you so you can try the classes and methods you have to put together */

public class ExecuteShapes {

    public static void main(String[] args) {
        Point one = new Point(0,0);
        Point two = new Point(0,2);
        Point three = new Point(1,2);
        Point four = new Point(1,0);
        Point[] square = {one, two, three, four};

        // Polygon
        System.out.println("Let's play with Polygons: ");
        Polygon shape = new Polygon(square, "square");
        System.out.println(shape.perimeter());
        System.out.println(shape.area());

        // Rectangle
        System.out.println("Let's play with Rectangles: ");
        Rectangle R = new Rectangle();
        R.setVertices(square);
        System.out.println(R.toString());
        System.out.println(R.area());

        Point one2 = new Point(1,0);
        Point two2 = new Point(2,0);
        Point three2 = new Point(2,-1);
        Point four2 = new Point(1,-1);
        Point[] square2 = {one2, two2, three2, four2};
        Rectangle R2 = new Rectangle();
        R2.setVertices(square2);
        System.out.println(R2.toString());
        System.out.println(R2.area());

        System.out.println(R.distanceMin(R2));

        // Triangle
        Point[] tri = {one, two, three};
        Polygon shapeT = new Polygon(tri, "triangle");
        System.out.println(shapeT.perimeter());
        System.out.println(shapeT.area());

        System.out.println("Let's play with Triangles: ");
        Triangle T = new Triangle();
        T.setVertices(tri);
        System.out.println(T.toString());

        System.out.println(T.area());

        System.out.println(T.distanceMin(R2));

        // Array of polygons of different specialized types
        Polygon[] AP = new Polygon[3];
        AP[0] = new Rectangle();
        AP[0].setVertices(square2);
        AP[1] = new Triangle();
        AP[1].setVertices(tri);
        AP[2] = new Polygon(square,"square");
        for (int i=0; i<AP.length; i++) {
            System.out.println(AP[i].toString());
            System.out.println(AP[i].area());
        }

        // Let's play
        Polygon P2 = new Rectangle();
        P2.setVertices(square);
        System.out.println(P2.toString());
        System.out.println(P2.area());


    }

}
