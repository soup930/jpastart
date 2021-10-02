package jpastart.main;

import jpastart.jpa.EMF;
import jpastart.reserve.model.*;

import javax.persistence.*;

public class HotelMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpastart");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

       /*try {
            transaction.begin();
            Review review = new Review("KR-S-01", 5, "최고에요");
            entityManager.persist(review);  // 이 시점에 insert 쿼리 실행
            Long id = review.getId();       // 자동 생서안 식별자가 엔티티에 반영됨
            transaction.commit();
            System.out.println("after commit");
        } catch (Exception ex) {
            transaction.rollback();
            throw ex;
        } finally {
            entityManager.close();
        }*/

       /*try {
            System.out.println("실행");
            transaction.begin();

            Room room = entityManager.find(Room.class, "R101");
            if (room != null) {
                System.out.println("삭제 쿼리를 실행합니다.");
                entityManager.remove(room); // 영속 컨텍스트에 삭제 대상 엔티티 추가
            }
            transaction.commit();   // 커밋 시점에 삭제 대상 처리
        } catch (Exception ex) {
            System.out.println("롤백합니다.");
            transaction.rollback();
            throw ex;
        } finally {
            System.out.println("종료합니다.");
            entityManager.close();
        }*/

        /*try {
            transaction.begin();
            Room room = entityManager.find(Room.class, "R101");
            if (room != null) {
                room.changeName("카프리");
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            throw ex;
        } finally {
            entityManager.close();
        }*/

        /*try {
            transaction.begin();
            Hotel hotel = entityManager.find(Hotel.class, "H100-01");
            Address address = hotel.getAddress();
            System.out.println(hotel.toString());
            System.out.println(address.toString());
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            throw ex;
        } finally {
            entityManager.close();
        }*/

        try {
            transaction.begin();
            Hotel hotel = entityManager.find(Hotel.class, "H100-01");
            hotel.changeAddress(new Address("08393", "서울시 구로구", "디지털로32길 72"));

            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            throw ex;
        } finally {
            entityManager.close();
        }

    }
}
