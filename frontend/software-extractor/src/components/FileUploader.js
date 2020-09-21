import React, { useState, useEffect } from 'react';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import FormGroup from 'react-bootstrap/esm/FormGroup';
import axios from 'axios';

const UPLOAD_ENDPOINT = 'http://localhost:8080/upload';

const styles = {
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
    justifyContent: 'center'
};

const onChange = e => {
    setFile(e.target.files[0]);
    setFileName(e.target.files[0].name);
}

const onSubmit = async e => {
    e.preventDefault();

    const formData = new FormData();
    formData.append('files', file);

    try {
        const res = await axios.post(UPLOAD_ENDPOINT, formData, {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        });
    } catch (err) {
        console.error(err);
    }
}
const FileUploader = () => {
    // Starting with one file for testing then using multiple
    const [file, setFile] = useState('');
    const [fileName, setFileName] = useState('');

    return (
        <div style={styles}>
        <Form onSubmit={ uploadFiles }>
        <Row style={styles}>
                <Col>
                    <Form.Group>
                        <Form.File 
                            id="fileUpload"
                            label="Upload Source Files"
                            custom
                        />
                    </Form.Group>
                </Col>
                <Col>
                    <Form.Group>
                        <Button>Submit Files</Button>
                    </Form.Group>
                </Col>
        </Row>
        </Form>
        </div>
    );
};

export default FileUploader;
