package org.edwith.webbe.cardmanager.ui;

import org.edwith.webbe.cardmanager.dto.BusinessCard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class CardManagerUI {
	
	// ���۸� �̿��� ����� - �ӵ�, ȿ���� ����
	private BufferedReader in;
	
	// �̱��� ���� ����
	// �⺻ �����ڸ� private���� �Ͽ� new �����ڷδ� �������� ���ϰ� getInstance�޼ҵ带 ���ϵ��� ��
    private CardManagerUI(){
        in = new BufferedReader(new InputStreamReader(System.in));
    }
    private static CardManagerUI instance = new CardManagerUI();
    public static CardManagerUI getInstance(){
        return instance;
    }

    
    
    // ���θ޴� ��� �޼ҵ�
    public void printMainMenu(){
        System.out.println("------------------------");
        System.out.println("1. ���� �Է�");
        System.out.println("2. ���� �˻�");
        System.out.println("3. ����");
        System.out.println("------------------------");
        System.out.print("�޴��� �Է��ϼ��� : ");
    }
    
    // ���۷� �Է¹��� ���ڸ� ���ڷ� ��ȯ�ϴ� �޼ҵ�
    public int getMenuNumber(){
        try {
            int menuNumber = Integer.parseInt(in.readLine());
            return menuNumber;
        }catch(Exception ex){
            return -1; // ���ڷ� ��ȯ ���� ��� -1�� �����Ѵ�
        }
    }

    
    // ���� �Է� �޼ҵ�
    public BusinessCard inputBusinessCard(){
        try {
            System.out.print("�̸��� �Է��ϼ��� : ");
            String name = in.readLine();
            System.out.print("��ȭ��ȣ�� �Է��ϼ���. : ");
            String phone = in.readLine();
            System.out.print("ȸ�� �̸��� �Է��ϼ��� : ");
            String companyName = in.readLine();
            BusinessCard businessCard = new BusinessCard(name, phone, companyName);
            return businessCard;
        }catch(Exception ex){
            System.out.println("�߸��� ���� �Է��߽��ϴ� ");
            return null;
        }
    }

    
    // ���� �˻� �޼ҵ�
    public String getSearchKeyword(){
        try {
            System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
            String searchKeyword = in.readLine();
            return searchKeyword;
        }catch(Exception ex){
            System.out.println("�߸��� ���� �Է��߽��ϴ�");
            return null;
        }
    }

    // ���� ��� �޼ҵ�
    public void printBusinessCards(List<BusinessCard> businessCardList){
        for(BusinessCard businessCard: businessCardList){
            System.out.println(businessCard);
            System.out.println("---------------------------------------------------------------");
        }
    }

    public void printExitMessage(){
        System.out.println("���α׷��� �Է��մϴ� ");
    }

    public void printErrorMessage(){
        System.out.println("�߸��� �Է��Դϴ�");
    }
}