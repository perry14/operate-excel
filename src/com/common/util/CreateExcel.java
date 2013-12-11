package com.common.util;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreateExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// ���ļ�
			WritableWorkbook book = Workbook
					.createWorkbook(new File("test.xls"));
			// ������Ϊ����һҳ���Ĺ���������0��ʾ���ǵ�һҳ
			WritableSheet sheet = book.createSheet(" ��һҳ ", 0);
			// ��Label����Ĺ�������ָ����Ԫ��λ���ǵ�һ�е�һ��(0,0)
			// �Լ���Ԫ������Ϊtest
			Label label = new Label(0, 0, " test ");

			// ������õĵ�Ԫ����ӵ���������
			sheet.addCell(label);

			/*
			 * ����һ���������ֵĵ�Ԫ�� ����ʹ��Number��������·�����������﷨���� ��Ԫ��λ���ǵڶ��У���һ�У�ֵΪ789.123
			 */
			jxl.write.Number number = new jxl.write.Number(1, 0, 555.12541);
			sheet.addCell(number);

			// д�����ݲ��ر��ļ�
			book.write();
			book.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @author Yue
	 * @param Excel�ļ���
	 */
	public static void createExcel(String excelName) {

		try {
			// ���ļ�
			WritableWorkbook book = Workbook.createWorkbook(new File(excelName
					+ ".xls"));
			// ������Ϊ��Sheet1���Ĺ���������0��ʾ���ǵ�һҳ
			book.createSheet("Sheet1", 0);
			book.createSheet("Sheet2", 1);
			book.createSheet("Sheet3", 2);

			// д�����ݲ��ر��ļ�
			book.write();
			book.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @author Yue
	 */
	public static void createExcel() {

		createExcel("test");
	}

}
