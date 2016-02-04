package optional;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by haozhexu on 1/30/16.
 */
public class OptionalTest {

    @Test
    public void testOf() throws Exception {
        Assert.assertEquals(Integer.valueOf(1), Optional.of(1).get());
        Assert.assertEquals(Integer.valueOf(1), Optional.of(1).orElse(2));
    }


}
