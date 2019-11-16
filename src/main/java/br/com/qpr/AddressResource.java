package br.com.qpr;

import br.com.qpr.entity.vo.AddressVO;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;

@Slf4j
@Path("/address")
public class AddressResource {

    @GET
    @Path("/{postalCod}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Buscar todos os address", summary = "getAddressAll")
    public AddressVO getAddressAll(@PathParam("postalCod") final String postalCod) {
        log.info("M=getAddressAll, postalCod={}", postalCod);

        final AddressVO addressOne = AddressVO.builder()
                .cep("36038090")
                .uf("MG")
                .bairro("Santos Dumont")
                .logradouro("Rua Jorge Fayer")
                .build();

        final AddressVO addressTwo = AddressVO.builder()
                .cep("36036630")
                .bairro("São Pedro")
                .logradouro("Rua Adolpho Kirchmaier")
                .uf("MG")
                .build();

        return Arrays.asList(addressOne, addressTwo)
                .stream()
                .filter(address -> address.getCep().equalsIgnoreCase(postalCod) )
                .findFirst()
                .get();
    }
}