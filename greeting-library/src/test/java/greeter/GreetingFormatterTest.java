package greeter;

import junit.framework.*;

class GreetingFormatterTest {
    public void shouldFormatName() {
        String formattedName = GreetingFormatter.greeting("name");
    }
}
