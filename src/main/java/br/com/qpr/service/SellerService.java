package br.com.qpr.service;

import br.com.qpr.entity.SellerEntity;
import br.com.qpr.entity.mapper.SellerMapper;
import br.com.qpr.entity.vo.SellerVO;
import br.com.qpr.repository.SellerRepository;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@Slf4j
@ApplicationScoped
public class SellerService {
    @Inject
    SellerRepository sellerRepository;

    public List<SellerEntity> getAll(){
        return sellerRepository.listAll();
    }

    public SellerEntity getById(final Long id){
        return sellerRepository.findById(id);
    }

    public void save(final SellerEntity seller){
        log.info("M=save, seller={}", seller);

        sellerRepository.persist(seller);
    }
}
