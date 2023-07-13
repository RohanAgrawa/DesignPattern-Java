public class GoogleMap {

    public void path(String mode) throws NullPointerException
    {
        PathFinder p = new PathFinder();
        GoogleMapPath g = p.getPath(mode);
        g.findPath();
    }

}
