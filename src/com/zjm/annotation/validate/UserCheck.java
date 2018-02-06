package com.zjm.annotation.validate;

import java.lang.reflect.Field;

public class UserCheck {

	public static boolean check(User user) {

		if (user == null) {
			System.out.println("validate object is null");
			return false;
		}

		Field[] fields = User.class.getDeclaredFields();

		for (Field field : fields) {
			if (field.isAnnotationPresent(Validate.class)) {
				Validate validate = field.getAnnotation(Validate.class);
				if (field.getName().equals("age")) {
					if (user.getAge() == null) {
						if (validate.isNotNull()) {
							System.out.println("��������ɿ�У�鲻ͨ��������Ϊ�գ���");
							return false;
						} else {
							System.out.println("����ɿ�У��ͨ��������Ϊ��");
							continue;
						}
					} else {
						System.out.println("����ɿ�У��ͨ��");
					}

					if (user.getAge().length() < validate.min()) {
						System.out.println("����������С����У�鲻ͨ������");
						return false;
					} else {
						System.out.println("������С����У��ͨ��");
					}

					if (user.getAge().length() > validate.max()) {
						System.out.println("����������󳤶�У�鲻ͨ������");
						return false;
					} else {
						System.out.println("������󳤶�У��ͨ��");
					}
				}

				if (field.getName().equals("name")) {
					if (user.getName() == null) {
						if (validate.isNotNull()) {
							System.out.println("�������ֿɿ�У�鲻ͨ��������Ϊ�գ���");
							return false;
						} else {
							System.out.println("���ֿɿ�У��ͨ��������Ϊ��");
							continue;
						}
					} else {
						System.out.println("���ֿɿ�У��ͨ��");
					}

					if (user.getName().length() < validate.min()) {
						System.out.println("����������С����У�鲻ͨ������");
						return false;
					} else {
						System.out.println("������С����У��ͨ��");
					}

					if (user.getName().length() > validate.max()) {
						System.out.println("����������󳤶�У�鲻ͨ������");
						return false;
					} else {
						System.out.println("������󳤶�У��ͨ��");
					}
				}

			}

		}
		return true;
	}

}
