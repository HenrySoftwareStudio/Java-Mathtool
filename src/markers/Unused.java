package markers;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

/**
 * this should be used to indicate a method/class/field/constructor is not used
 * @author also me
 *
 */
@Target({ TYPE, FIELD, METHOD, CONSTRUCTOR })
public @interface Unused
{
	
}
