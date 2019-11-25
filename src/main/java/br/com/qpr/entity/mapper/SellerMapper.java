package br.com.qpr.entity.mapper;

import br.com.qpr.entity.SellerEntity;
import br.com.qpr.entity.vo.SellerVO;

import java.util.List;
import java.util.stream.Collectors;

public interface SellerMapper {

    public static SellerEntity voToEntity(final SellerVO vo) {
        return SellerEntity.builder()
                .id(vo.getId())
                .name(vo.getName())
                .active(vo.getActive())
                .build();
    }

    public static SellerVO entityToVO(final SellerEntity entity){
        return SellerVO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .active(entity.getActive())
                .build();
    }

    public static List<SellerVO> listEntityToVO(final List<SellerEntity> sellerEntityList){
        return sellerEntityList
                .stream()
                .map(SellerMapper::entityToVO)
                .collect(Collectors.toList());
    }
}
