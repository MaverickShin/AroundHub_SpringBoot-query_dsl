package studio.thinkground.aroundhub.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import studio.thinkground.aroundhub.data.dto.ProductDto;

@Entity
@Getter // get() 함수를 만듦
@Setter // set() 함수를 만듦
@NoArgsConstructor // 파라미터가 없는 생성자 생성 : 디폴트 생성자
@AllArgsConstructor // 모든 필트값을 파라미터로 갖는 생성자 생성 : 매개변수 생성자
// @RequiredArgConstructor // 필드값 중 final이나 @NotNull인 값을 갖는 생성자를 생성
@Builder
@ToString // toString() 메소드를 생성한다
@Table(name = "product")
public class Product {

  // Entity와 dto의 차이 : Entity는 실제 db와 일치, dto는 db와 서비스에서 추가로 필요한 요소까지 포함
  
  @Id
  String id;

  String name;

  Integer price;

  Integer stock;

  /*
  @Column
  String sellerId;

  @Column
  String sellerPhoneNumber;
   */

  public ProductDto toDto(){
    return ProductDto.builder()
        .productId(id)
        .productName(name)
        .productPrice(price)
        .productStock(stock)
        .build();
  }

}
