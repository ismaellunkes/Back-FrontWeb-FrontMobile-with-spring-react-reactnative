import React from 'react';
import { StyleSheet, Text } from 'react-native';
import Header from '../../components/Header';

const CreateRecord = () =>{
    return(
        <>
        <Header/>
        <Text style={styles.container}>Hello CreateRecord</Text>
        </>
    );
}

const styles = StyleSheet.create({
    container: {
      color:'#FFF',
      fontSize: 50,
      textAlign:'center',
      marginTop: 100
    }
  });

export default CreateRecord;