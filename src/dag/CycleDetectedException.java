package dag;



import java.util.Iterator;
import java.util.List;

public class CycleDetectedException
        extends Exception
{
    private List cycle;

    public CycleDetectedException( final String message, final List cycle )
    {
        super( message );

        this.cycle = cycle;

    }


    public List getCycle()
    {
        return cycle;
    }

    /**
     * @return
     */
    public String cycleToString()
    {
        final StringBuffer buffer = new StringBuffer();

        for ( Iterator iterator = cycle.iterator(); iterator.hasNext(); )
        {
            buffer.append( iterator.next() );

            if ( iterator.hasNext() )
            {
                buffer.append( " --> " );
            }
        }
        return buffer.toString();
    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + " " + cycleToString();
    }
}
