
public class Sort {

	public static void main(String[] args) {
		int iNum[] = {5,7,1,2};
		
		int iRow;
		int iCol;
		int iCount;
		
		for (iRow = 0; iRow< iNum.length; iRow++)
		{
			for (iCol = iNum.length-1; iCol>= iRow; iCol--)
			{
				if ( iNum[iCol] > iNum[iCol])
				{
					iCount = iNum[iCol-1];
					iNum[iCol-1] = iNum[iCol];//{5, 1, 1, 2}
					iNum[iCol] = iCount; // {5, 1, 7, 2}
				}
			}
		}

	}

}
