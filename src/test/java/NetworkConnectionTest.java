import org.junit.Test;

public class NetworkConnectionTest {

    @Test (timeout = 1000)
    public void netConnectionShouldReturnFasterThanOneSecond (){
        networkConnection.getConnection();
    }
}
