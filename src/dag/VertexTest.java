package dag;
import constant.*;
import pc.TARGET;


/**
 * @author <a href="michal.maczka@dimatics.com">Michal Maczka</a>
 * @version $Id: VertexTest.java 8010 2009-01-07 12:59:50Z vsiveton $
 */
public class VertexTest 
{
    public void testVertex()
    {

        final TARGET v1 = new TARGET();
        DAG dg = new DAG();
        dg.addVertex(v1);
        final Vertex vertex2 = new TARGET();

       

        v1.addEdgeTo( vertex2 );

       
    }

    public static void main(String[] args){

    }
}
