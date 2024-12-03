package kr.heesoo.hsarchive.member.repository;

import kr.heesoo.hsarchive.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
