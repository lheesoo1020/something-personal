package kr.heesoo.hsarchive.member.domain;

import jakarta.persistence.*;
import kr.heesoo.hsarchive.common.entity.BaseField;
import lombok.*;

@Entity
@Getter
@Table(name = "member", uniqueConstraints = {
        @UniqueConstraint(
                name="EMAIL_UNIQUE",
                columnNames="email"
        )
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Setter
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "username", nullable = false)
    private String username;

}
