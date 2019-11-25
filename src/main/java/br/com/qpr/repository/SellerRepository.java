package br.com.qpr.repository;

import br.com.qpr.entity.SellerEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SellerRepository implements PanacheRepository<SellerEntity> {
}
