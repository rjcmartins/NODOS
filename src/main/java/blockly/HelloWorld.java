package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@RestController
@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class HelloWorld {

public static final int TIMEOUT = 300;

/**
 *
 * HelloWorld
 *
 * @author Rafael Juan Cardoso Martins
 * @since 14/05/2024, 11:35:48
 *
 */
@RequestMapping(path = "/api/v1/HelloWorld", method = RequestMethod.GET, consumes = "*/*")
@CronappSecurity(post = "None", get = "Public", execute = "None", delete = "None", put = "None")
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
Var.valueOf("Hello, World!");
   }
 }.call();
}

/**
 *
 * @author Rafael Juan Cardoso Martins
 * @since 14/05/2024, 11:35:48
 *
 */
public static Var GetDataAtual() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.dateTime.Operations.getNowNoHour();
   }
 }.call();
}

}

