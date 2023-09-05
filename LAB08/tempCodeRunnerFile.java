boolean hasNoZeros = false;
while (!hasNoZeros)
{
    hasNoZeros = true;
    for (int i = 0; i < pileCount; i++)
    {
        if (piles[i] == 0)
        {
            for (int j = i; j < pileCount - 1; j++)
            {
                piles[j] = piles[j+1];
            }
            pileCount--;
            hasNoZeros = false;
        }    
    }     
}