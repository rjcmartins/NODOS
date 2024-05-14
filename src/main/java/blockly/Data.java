package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@RestController
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Data {

public static final int TIMEOUT = 300;

/**
 *
 * @author Rafael Juan Cardoso Martins
 * @since 14/05/2024, 11:37:56
 *
 */
@RequestMapping(path = "/api/cronapi/rest/Data:GetDataAtuala", method = RequestMethod.GET, consumes = "application/json")
@CronappSecurity(execute = "Public")
public static Var GetDataAtuala() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.dateTime.Operations.getNowNoHour();
   }
 }.call();
}

}

