package br.com.qpr.resources;

import br.com.qpr.entity.SellerEntity;
import br.com.qpr.entity.mapper.SellerMapper;
import br.com.qpr.entity.vo.SellerVO;
import br.com.qpr.service.SellerService;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Slf4j
@Tag(name = "Seller", description = "Endpoints de manutenção de vendedores")
@Path("/seller")
public class SellerResource {

    @Inject
    SellerService sellerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Buscar todos os vendedor", summary = "getAll")
    public List<SellerVO> getAll(){
        return SellerMapper.listEntityToVO(sellerService.getAll());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Buscar todos os vendedor", summary = "getSeller")
    public SellerVO getSeller(@PathParam("id") final Long id){
        return SellerMapper.entityToVO(sellerService.getById(id));
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(description = "Adiciona novo vendedor", summary = "addSeller")
    public void addSeller(@RequestBody final SellerVO seller) {
        log.info("M=addSeller sellerVO={}", seller);
        sellerService.save(SellerMapper.voToEntity(seller));
    }

}
