class Solution {
public:
    bool FindValue(vector<vector<int>>& matrix, int target , int MidRow){
        int start = 0;
        int end = matrix[0].size() - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(matrix[MidRow][mid] == target)
                return true;
            else if(matrix[MidRow][mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size();
        int col = matrix[0].size();
        int StartRow = 0;
        int EndRow = row - 1;

        while(StartRow <= EndRow){
            int midRow = StartRow + (EndRow - StartRow) / 2;

            if(target >= matrix[midRow][0] && target <= matrix[midRow][col-1]){
               
                return FindValue(matrix, target, midRow);
            }
            else if(target > matrix[midRow][col-1]){
                StartRow = midRow + 1;
            }
            else {
                EndRow = midRow - 1;
            }
        }
        return false;
    }
};
